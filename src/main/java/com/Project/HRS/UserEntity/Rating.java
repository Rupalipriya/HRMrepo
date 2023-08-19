package com.Project.HRS.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rating_system")
public class Rating {
	@Id
	private String ratingid;
	@Column
	private String userid;
	@Column
	private String hotelid;
	@Column
	private String rating;
	@Column
	private String feedback;
	public String getRatingid() {
		return ratingid;
	}
	public void setRatingid(String ratingid) {
		this.ratingid = ratingid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getHotelid() {
		return hotelid;
	}
	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
		

}
