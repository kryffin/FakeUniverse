package fr.univlorraine.FakeUniverse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

@Component
public class InitBD implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Création et initialisation de la base de données");

        String[] sqlStatements = {
                "drop table celestial_body if exists",
                "create table celestial_body(name varchar(255), radius double, distance_from_origin double, gravity double)",
                "INSERT INTO celestial_body (name, radius, distance_from_origin, gravity) VALUES('Schtroumpf', 10., 3000.3, 1.);",
                "INSERT INTO celestial_body (name, radius, distance_from_origin, gravity) VALUES('Irridescent', 20., 3000.3, 1.);",
                "INSERT INTO celestial_body (name, radius, distance_from_origin, gravity) VALUES('Gargamel', 10., 70.7, 3.);"
        };

        Arrays.stream(sqlStatements).forEach(sql -> {
            System.out.println(sql);
            jdbcTemplate.execute(sql);
        });

        System.out.println("Affichage de tous les corps --------------------");
        jdbcTemplate.query("select * from celestial_body",
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet body, int i) throws SQLException {
                        System.out.println("name: " + body.getString("name") +
                                " radius: " + body.getString("radius"));
                        return null;
                    }
                });
    }

}
