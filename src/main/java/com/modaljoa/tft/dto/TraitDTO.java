package com.modaljoa.tft.dto;

import com.modaljoa.tft.vo.riotApi.match.matchId.Trait;
import lombok.Data;

@Data
public class TraitDTO {
    private String traitName;
    private int numUnits;
    private int style;
    private int tierCurrent;
    private int tierTotal;

    public TraitDTO(Trait trait) {
        this.traitName = trait.getName();
        this.numUnits = trait.getNumUnits();
        this.style = trait.getStyle();
        this.tierCurrent = trait.getTierCurrent();
        this.tierTotal = trait.getTierTotal();
    }
}
