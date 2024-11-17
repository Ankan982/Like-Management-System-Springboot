package com.kafkaproducer.InstalikeManagement.model;

public class CreateOrUpdateLikeRequest {
	
	public String createOrUpdateFlag;
	
	public String post_id;

	public String like_count;

	public String getCreateOrUpdateFlag() {
		return createOrUpdateFlag;
	}

	public void setCreateOrUpdateFlag(String createOrUpdateFlag) {
		this.createOrUpdateFlag = createOrUpdateFlag;
	}

	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}

	public String getLike_count() {
		return like_count;
	}

	public void setLike_count(String like_count) {
		this.like_count = like_count;
	}

	@Override
	public String toString() {
		return "CreateOrUpdateLikeRequest [createOrUpdateFlag=" + createOrUpdateFlag + ", post_id=" + post_id
				+ ", like_count=" + like_count + ", getCreateOrUpdateFlag()=" + getCreateOrUpdateFlag()
				+ ", getPost_id()=" + getPost_id() + ", getLike_count()=" + getLike_count() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
