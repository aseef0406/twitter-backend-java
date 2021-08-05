/*
 * Twitter Backend - Moo: Twitter Clone Application Backend by Scaler
 * Copyright © 2021 Subhrodip Mohanta (hello@subho.xyz)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package xyz.subho.clone.twitter.model;

import java.util.UUID;
import lombok.Data;

@Data
public class UserModel {

  private UUID id;
  private String username;
  private String name;
  private String avatar;
  private String bio;
  private Long followerCount;
  private Long followingCount;
  private Boolean verified;

  public UUID getId() {
	return id;
  }

  public void setId(UUID id) {
	this.id = id;
  }

  public String getUsername() {
	return username;
  }

  public void setUsername(String username) {
	this.username = username;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getAvatar() {
	return avatar;
  }

  public void setAvatar(String avatar) {
	this.avatar = avatar;
  }

  public String getBio() {
	return bio;
  }

  public void setBio(String bio) {
	this.bio = bio;
  }

  public Long getFollowerCount() {
	return followerCount;
  }

  public void setFollowerCount(Long followerCount) {
	this.followerCount = followerCount;
  }

  public Long getFollowingCount() {
	return followingCount;
  }

  public void setFollowingCount(Long followingCount) {
	this.followingCount = followingCount;
  }

  public Boolean getVerified() {
	return verified;
  }

  public void setVerified(Boolean verified) {
	this.verified = verified;
  }
  
}
