package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.constants.KidFriendlyStatus;

public abstract class Bookmark {
	private long id;
	private String title;
	private String profileUrl;
	private KidFriendlyStatus kidFriendlyStatus = KidFriendlyStatus.UNKNOWN;
	private User KidFriendlyMarkBy;
	private User ShareBy;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	
	public abstract boolean isKidFriendlyEligible();

	public KidFriendlyStatus getKidFriendlyStatus() {
		return kidFriendlyStatus;
	}

	public void setKidFriendlyStatus(KidFriendlyStatus kidFriendlyStatus) {
		this.kidFriendlyStatus = kidFriendlyStatus;
	}

	public User getKidFriendlyMarkBy() {
		return KidFriendlyMarkBy;
	}

	public void setKidFriendlyMarkBy(User kidFriendlyMarkBy) {
		KidFriendlyMarkBy = kidFriendlyMarkBy;
	}

	public User getShareBy() {
		return ShareBy;
	}

	public void setShareBy(User shareBy) {
		ShareBy = shareBy;
	}
}








