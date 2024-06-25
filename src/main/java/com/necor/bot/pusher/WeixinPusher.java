package com.necor.bot.pusher;

import org.springframework.beans.factory.annotation.Value;

public class WeixinPusher extends BotPusher {

    public WeixinPusher() {
        setPushTemplate("{\"msg_type\":\"interactive\",\"card\":{\"header\":{\"title\":{\"content\":\"%s\",\"tag\":\"plain_text\"},\"template\":\"%s\"},\"elements\":[{\"tag\":\"div\",\"text\":{\"content\":\"**消息时间：**%s\",\"tag\":\"lark_md\"}},{\"tag\":\"div\",\"text\":{\"content\":\"**消息内容：** %s \",\"tag\":\"lark_md\"}}]}}");
    }

}
