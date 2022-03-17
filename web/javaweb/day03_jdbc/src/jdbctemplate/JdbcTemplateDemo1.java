package jdbctemplate;

import Utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate 入门
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        //1 导入jar包
        //2 创建JDBCTemplate
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3调用方法
        String sql="update tb_brand set status = ? where id = ?";
        int update = template.update(sql, 0, 1);
        if(update>0){
            System.out.println("修改成功");
        }
        else{
            System.out.println("修改失败");
        }

    }
}
