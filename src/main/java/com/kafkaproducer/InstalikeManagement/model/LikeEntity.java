package com.kafkaproducer.InstalikeManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_temp_like_update")
public class LikeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long tbl_id;
	
	@Column
	private long post_id;
	
	@Column
	private long like_count;
	
	
	public long getTbl_id() {
		return tbl_id;
	}
	public void setTbl_id(long tbl_id) {
		this.tbl_id = tbl_id;
	}
	public long getPost_id() {
		return post_id;
	}
	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}
	public long getLike_count() {
		return like_count;
	}
	public void setLike_count(long like_count) {
		this.like_count = like_count;
	}
	
	
	
	
	
	
}
