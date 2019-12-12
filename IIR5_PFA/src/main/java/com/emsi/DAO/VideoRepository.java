package com.emsi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.Video;

public interface VideoRepository extends JpaRepository<Video, Integer>{

}
