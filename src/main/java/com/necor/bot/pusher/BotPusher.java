package com.necor.bot.pusher;

import com.necor.bot.pusher.constant.Level;
import com.necor.bot.util.HttpUtils;
import org.springframework.util.ObjectUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BotPusher {

    private String pushUrl;

    private String pushTemplate;

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public String getPushTemplate() {
        return pushTemplate;
    }

    public void setPushTemplate(String pushTemplate) {
        this.pushTemplate = pushTemplate;
    }

    public String push(String level, String msg) {
        String title = "其它信息";
        String template = "grey";

        level = ObjectUtils.isEmpty(level) ? Level.DEFAULT : level;
        switch (level) {
            case Level.INFO: {
                title = "提示信息";
                template = "green";
                break;
            }
            case Level.WARN: {
                title = "警告信息";
                template = "orange";
                break;
            }
            case Level.ERROR: {
                title = "异常信息";
                template = "red";
                break;
            }
            default: {
                title = "其它信息";
                template = "grey";
                break;
            }
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());

        msg = ObjectUtils.isEmpty(msg)? "空信息": msg.length() > 200 ? msg.substring(0,200): msg;

        String pushCont = String.format(pushTemplate, title, template, date, msg);

        return HttpUtils.postJosn(pushUrl, pushCont);
    }

}
