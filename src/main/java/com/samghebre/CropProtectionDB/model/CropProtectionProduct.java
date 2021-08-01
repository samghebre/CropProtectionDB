package com.samghebre.CropProtectionDB.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class CropProtectionProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "trade_name")
    private String tradeName;

    @Column(name = "active_ingredient")
    private String activeIngredient;


    private String pesticideType;

    public CropProtectionProduct() {
    }

    public CropProtectionProduct(String tradeName, String activeIngredient, String pesticideType) {
        this.tradeName = tradeName;
        this.activeIngredient = activeIngredient;
        this.pesticideType = pesticideType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public String getPesticideType() {
        return pesticideType;
    }

    public void setPesticideType(String pesticideType) {
        this.pesticideType = pesticideType;
    }
}
