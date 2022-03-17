package branch;

public class CaseDemo3 {
    public static void main(String[] args) {
        //目标 清楚switch的注意点 并在开发的时候注意
        //表达式类型只能是byte short int char jdk5开始支持枚举 jdk7开始支持string 不支持double float long
        char a='c';
        switch(a){

        }
        //case给出的值不允许重复 且只能是字面量，不能是变量
        //不要忘记写break 不然可能出现穿透现象
    }
}
