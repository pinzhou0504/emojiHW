package com.emojiHW.domain;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Table(name = "emojis")
public class Emoji {
        @Id
        @GeneratedValue(strategy = SEQUENCE, generator = "emojis_id_seq")
        @SequenceGenerator(name = "emojis_id_seq",sequenceName = "emojis_id_seq",allocationSize = 1)
        private Long id;

        @Column(name = "code")
        private String code;

        @Column(name = "cldr_short_name")
        private String cLDRShortName;
}