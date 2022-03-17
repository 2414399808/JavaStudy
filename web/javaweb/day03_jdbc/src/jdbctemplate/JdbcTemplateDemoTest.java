package jdbctemplate;

import Utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import pojo.Account;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemoTest {
    @Test
    public void testUpdate(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="update tb_user set password = ? where id = ?";
        int update = template.update(sql, "124", 1);
        if(update>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }

    }
    @Test
    public void testqueryForMap(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="select * from account where id = ?";
        Map<String, Object> stringObjectMap = template.queryForMap(sql,1);
        System.out.println(stringObjectMap);

    }
    @Test
    public void testqueryForList(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="select * from account where id = ?";
        List<Map<String, Object>> maps = template.queryForList(sql,1);
        System.out.println(maps);

    }
    @Test
    public void testquery(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="select * from account";
        List<Account> query = template.query(sql, new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet rs, int i) throws SQLException {
                Account a = new Account(rs.getInt(1), rs.getString(2), rs.getString(3));
                return a;
            }
        });
        System.out.println(query);

    }
    @Test
    public void testquery2(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="select * from account";
        List<Account> query = template.query(sql, new BeanPropertyRowMapper<Account>(Account.class));

        System.out.println(query);

    }
    @Test
    public void testqueryForObject(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="select count(*) from account ";
        Long aLong = template.queryForObject(sql, Long.class);
        System.out.println(aLong);

    }
}
