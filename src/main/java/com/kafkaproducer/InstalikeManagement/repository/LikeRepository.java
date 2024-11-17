package com.kafkaproducer.InstalikeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kafkaproducer.InstalikeManagement.model.LikeEntity;

@Repository
public interface LikeRepository extends JpaRepository<LikeEntity, Long> {
	
	 
	@Query("SELECT u FROM LikeEntity u WHERE u.post_id = :postId")
	LikeEntity findByPostId(@Param("postId") Long postId);

}
