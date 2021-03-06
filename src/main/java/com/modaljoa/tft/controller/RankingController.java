package com.modaljoa.tft.controller;

import com.modaljoa.tft.dto.RankingDTO;
import com.modaljoa.tft.dto.SummonerLeagueDTO;
import com.modaljoa.tft.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RankingController {

    private final RankingService rankingService;

    @GetMapping("/ranking/{tier}")
    public RankingDTO getTopTierUsers(@PathVariable String tier) {
        return rankingService.getTopTierUsers(tier);
    }

    @GetMapping("/ranking/{tier}/{division}")
    public List<SummonerLeagueDTO> findLowTierInfo(@PathVariable String tier, @PathVariable String division) {
        return rankingService.getLowTierUsers(tier, division);
    }
}
