package d11_interface_implements;
/*
实现类
 */
public class PingPongMan implements SportMan,Law{
    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void rule() {
        System.out.println(name+"要遵章守法");
    }

    @Override
    public void run() {
        System.out.println(name+"要跑步训练");
    }

    @Override
    public void competition() {
        System.out.println(name+"需要参加国际比赛");
    }
}
