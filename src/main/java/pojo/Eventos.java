/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author marcocameros
 */
@Entity
@Table(name="Eventos", catalog="zbxv4rd7u4k5zprr")
public class Eventos {
    
    @Id @GeneratedValue
    @Column(name="idEventos")
    private int id;
    
    @Column(name="Text")
    private String text;
    
    @Column(name="Location")
    private String location;
    
    @Column(name="Name")
    private String name;
    
    @Column(name="StartDate")
    private Date startdate;
    
    @Column(name="EndDate")
    private Date enddate;

    public int getIdEventos() {
        return id;
    }

    public void setIdEventos(int idEventos) {
        this.id = idEventos;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    
    
    
}
