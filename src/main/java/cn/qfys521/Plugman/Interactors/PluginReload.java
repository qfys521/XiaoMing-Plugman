package cn.qfys521.Plugman.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.plugin.Plugin;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.Plugman.PlugmanPlugin;

public class PluginReload extends SimpleInteractors<PlugmanPlugin> {

    @Filter("plugman reload {r:PluginName}")
    @Required("plugman.reload")
    public void reload(XiaoMingUser user,
                       @FilterParameter("PluginName") Plugin Name) {
        try {
            xiaoMingBot.getFileSaver().save();
            xiaoMingBot.getPluginManager().reloadPlugin(Name);
            xiaoMingBot.getPluginManager().reenablePlugin(Name);
        } catch (Exception e) {
            user.sendError("重启时发生错误,异常为:" + e);
        }
        user.sendMessage("插件重启成功.");
    }
}
