package com.yukgaejang.voss.domain.meet.repository.entity;

import com.yukgaejang.voss.global.entity.BaseEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Meet extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String title;
    private int maxCount;
    private boolean isPassword;
    private boolean isDeleted;
    private String sessionId;

    @Nullable
    private String password;

    @OneToMany(mappedBy = "meet", cascade = CascadeType.ALL)
    private List<MeetJoin> meetJoins = new ArrayList<>();

    public Meet(String category, String title, int maxCount, boolean isPassword, boolean isDeleted, String sessionId) {
        this.category = category;
        this.title = title;
        this.maxCount = maxCount;
        this.isPassword = isPassword;
        this.isDeleted = isDeleted;
        this.sessionId = sessionId;
    }

    public Meet(String category, String title, int maxCount, boolean isPassword, boolean isDeleted, String sessionId, String password) {
        this.category = category;
        this.title = title;
        this.maxCount = maxCount;
        this.isPassword = isPassword;
        this.isDeleted = isDeleted;
        this.sessionId = sessionId;
        this.password = password;
    }
}
