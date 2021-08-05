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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class PostModel {

  private UUID id;
  private String text;
  private UUID userId;
  private List<String> images = new ArrayList<>(4);
  private Long likeCount;
  private Long repostCount;
  private UUID originalPostId;
  private UUID replyToId;
  private Date timestamp;
  private List<String> hashtags = new ArrayList<>();
  private List<String> mentions = new ArrayList<>();
	
  public UUID getId() {
		return id;
	}
	
  public void setId(UUID id) {
		this.id = id;
	}
	
  public String getText() {
		return text;
	}
	
  public void setText(String text) {
		this.text = text;
	}
	
  public UUID getUserId() {
		return userId;
	}
	
  public void setUserId(UUID userId) {
		this.userId = userId;
	}
	
  public List<String> getImages() {
		return images;
	}
	
  public void setImages(List<String> images) {
		this.images = images;
	}
	
  public Long getLikeCount() {
		return likeCount;
	}
	
  public void setLikeCount(Long likeCount) {
		this.likeCount = likeCount;
	}
	
  public Long getRepostCount() {
		return repostCount;
	}
	
  public void setRepostCount(Long repostCount) {
		this.repostCount = repostCount;
	}
	
  public UUID getOriginalPostId() {
		return originalPostId;
	}
	
  public void setOriginalPostId(UUID originalPostId) {
		this.originalPostId = originalPostId;
	}
	
  public UUID getReplyToId() {
		return replyToId;
	}
	
  public void setReplyToId(UUID replyToId) {
		this.replyToId = replyToId;
	}
	
  public Date getTimestamp() {
		return timestamp;
	}
	
  public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
  public List<String> getHashtags() {
		return hashtags;
	}
	
  public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}
	
  public List<String> getMentions() {
		return mentions;
	}
	
  public void setMentions(List<String> mentions) {
		this.mentions = mentions;
	}
}
