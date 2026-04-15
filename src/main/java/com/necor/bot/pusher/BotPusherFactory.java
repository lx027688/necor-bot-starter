package com.necor.bot.pusher;


import com.necor.bot.pusher.constant.Pusher;

import java.util.HashMap;
import java.util.Map;

public class BotPusherFactory {

    private static final Map<String, Class<? extends BotPusher>> pusherMap = new HashMap<>();

    static {
        pusherMap.put(Pusher.LARK, LarkPusher.class);
        pusherMap.put(Pusher.WEIXIN, WeixinPusher.class);
    }

    public static BotPusher getPusher(String pusher) {
        Class<? extends BotPusher> pusherClass = pusherMap.get(pusher.toLowerCase());
        if (pusherClass == null) {
            throw new IllegalArgumentException("Invalid pusher: " + pusher);
        }

        try {
            return pusherClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create BotMsgPusher instance", e);
        }
    }

    public static BotPusher getPusher(String pusher, String url) {
        Class<? extends BotPusher> pusherClass = pusherMap.get(pusher.toLowerCase());
        if (pusherClass == null) {
            throw new IllegalArgumentException("Invalid pusher: " + pusher);
        }

        try {
            BotPusher instance = pusherClass.getDeclaredConstructor().newInstance();
            instance.setPushUrl(url);
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to create BotMsgPusher instance", e);
        }
    }

}
