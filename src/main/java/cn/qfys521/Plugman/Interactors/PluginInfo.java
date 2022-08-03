package cn.qfys521.Plugman.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.plugin.PluginHandler;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Plugman.PlugmanPlugin;

public class PluginInfo extends
        SimpleInteractors<PlugmanPlugin> {

    @Filter("plugman info {r:PluginName}")
    @Required("plugman.pluginInfo")
    public void PluginInfos(XiaoMingUser user,
                           @FilterParameter("PluginName") PluginHandler plugin,
                           @FilterParameter("PluginName") Plugin Name) {
        user.sendMessage(
                "名称:" + plugin.getName() +
                        "\n版本:" + Name.getVersion() +
                        "\n作者:" + plugin.getSingleAuthor() +
                        "\n插件主类:" + plugin.getMainClassName() +
                        "\n启动状态:" + Name.getStatus() +
                        "\n命令数量:" + this.xiaoMingBot.getInteractorManager().getInteractors(Name).size() +
                        "\n监听器数量" + this.xiaoMingBot.getEventManager().getListeners(Name).size()
        );

    }

    @Filter("指令信息 {CommandName}")
    @Required("plugman.commandInfo")
    public void commandInfo(XiaoMingUser user,
                            @FilterParameter("CommandName")String CommandName){
        user.sendMessage("");
    }

}
 