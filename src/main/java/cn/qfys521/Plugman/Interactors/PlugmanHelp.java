package cn.qfys521.Plugman.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Plugman.PlugmanPlugin;

public class PlugmanHelp extends SimpleInteractors<PlugmanPlugin> {
    @Filter("plugman help")
    @Required("plugman.help")
    public void main(XiaoMingUser user) {
        user.sendMessage("[XiaoMing-PLUGMAN]" +
                "\n作者:qfys521" +
                "\n=========" +
                "\nplugman info <插件名>" +
                "\nplugman reload <插件名>");
    }
}
