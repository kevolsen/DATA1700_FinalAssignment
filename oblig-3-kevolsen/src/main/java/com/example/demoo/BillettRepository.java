package com.example.demoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillettRepository {

    @Autowired
    public JdbcTemplate db;

    public void lagreBillett(Billett billett) {
        String sql = "INSERT INTO Billett (navn,antall,fornavn,etternavn,tlfnr,email) VALUES(?,?,?,?,?,?)";
        db.update(sql,billett.getNavn(),billett.getAntall(),billett.getFornavn(),billett.getEtternavn(),billett.getTlfnr(),billett.getEmail());
    }

    public List<Billett> hentAlleBilletter() {
        String sql = "SELECT * FROM Billett ORDER BY etternavn";
        List<Billett> alleBilletter = db.query(sql,new BeanPropertyRowMapper(Billett.class));
        return alleBilletter;
    }

    public Billett hentEnBillett(int id) {
        Object[] param = new Object[1];
        param[0] = id;
        String sql = "SELECT * FROM Billett WHERE id=?";
        Billett enBillett = db.queryForObject(sql, param, BeanPropertyRowMapper.newInstance(Billett.class));
        return enBillett;
    }

    public void slettEnBillett(int id) {
        String sql = "DELETE FROM Billett WHERE id=?";
        db.update(sql,id);
    }

    public void slettAlleBilletter () {
        String sql = "DELETE FROM Billett";
        db.update(sql);
    }
}
