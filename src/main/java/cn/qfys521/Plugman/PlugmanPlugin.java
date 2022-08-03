package cn.qfys521.Plugman;


import cn.chuanwise.xiaoming.plugin.JavaPlugin;
import cn.qfys521.Plugman.Interactors.PluginInfo;
import cn.qfys521.Plugman.Interactors.PluginReload;
import cn.qfys521.Plugman.Interactors.PlugmanHelp;


/**
 * 插件主类
 * 类的全限定名要和资源文件 xiaoming.json 或 plugin.json 中的 main 完全相同
 *
 * @author qfys521
 * @version 0.1-SNAPSHOT<
 */
public class PlugmanPlugin extends JavaPlugin {

    /**
     * 插件具备 static final 的名为 INSTANCE 的属性时，小明会首先查看其值是否</br>
     * 实现了 {@link cn.chuanwise.xiaoming.plugin.Plugin} 接口，如果实现</br>
     * 则取出并作为本插件加载。如果不是，或为 null，则小明将调用默认的无参构造方法
     * 构造一个插件主类的对象。
     */
    private static final PlugmanPlugin INSTANCE = new PlugmanPlugin();

    /**
     * 获取插件实例
     */
    public static PlugmanPlugin getInstance() {
        return INSTANCE;
    }


    /**
     * 插件启动时的回调方法
     */
    @Override
    public void onEnable() {
        /**
         * 插件头
         */
        final String PluginsName = "Plugman";
        final String left = "[";
        final String right = "]";
        final String Logger = left + PluginsName + right + ":" + " ";
        /**
         *输出加载信息
         */
        getLogger().info(Logger + "插件" + Logger + "加载中");
        /**
         * 注册监听器 插件加载
         */
//        getXiaoMingBot().getInteractorManager().registerInteractors(new PluginEnable(),this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new PluginInfo(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new PluginReload(), this);
        getXiaoMingBot().getInteractorManager().registerInteractors(new PlugmanHelp(), this);
    }

}
