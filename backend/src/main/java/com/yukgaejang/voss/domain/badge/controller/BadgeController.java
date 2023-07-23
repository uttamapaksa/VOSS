package com.yukgaejang.voss.domain.badge.controller;

import com.yukgaejang.voss.domain.badge.service.BadgeService;
import com.yukgaejang.voss.domain.badge.service.dto.request.GiveBadgeRequest;
import com.yukgaejang.voss.domain.badge.service.dto.response.GiveBadgeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/badge")
public class BadgeController {
    private final BadgeService badgeService;

    @PostMapping
    public ResponseEntity<GiveBadgeResponse> badge(@RequestBody GiveBadgeRequest giveBadgeRequest) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        badgeService.giveBadge(giveBadgeRequest, authentication.getName());

        return ResponseEntity.ok(new GiveBadgeResponse(true));
    }

}
