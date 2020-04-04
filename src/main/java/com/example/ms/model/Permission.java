package com.example.ms.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "sys_permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group")
    private String group;

    @Column(name = "path")
    private String path;

    @Column(name = "remark")
    private String remark;

    @Column(name = "deleted_flag")
    private Boolean deletedFlag;

    @Column(name = "create_id")
    private String createId;

    @Column(name = "created_time")
    private Timestamp createdTime;

    @Column(name = "update_id")
    private String updateId;

    @Column(name = "updated_time")
    private Timestamp updatedTime;
}