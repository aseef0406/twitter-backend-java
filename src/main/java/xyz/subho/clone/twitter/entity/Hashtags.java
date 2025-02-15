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

package xyz.subho.clone.twitter.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(
    name = "hashtags",
    indexes = {@Index(columnList = "tag")})
@Data
public class Hashtags {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(columnDefinition = "BINARY(16)")
  private UUID id;

  @Column(unique = true, nullable = false)
  private String tag;

  @Column(name = "recent_post_count", columnDefinition = "BIGINT(20) default '1'", nullable = false)
  private Long recentPostCount = 1L;

  @OneToMany(mappedBy = "hashtags", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JsonIgnore
  private List<HashtagPosts> hashtagPosts = new ArrayList<>();

  @CreationTimestamp private Date createdAt;

  @UpdateTimestamp private Date updatedAt;


  public int getRecentPostCount() {
	// TODO Auto-generated method stub
	return 0;
  }


public Object getTag() {
	// TODO Auto-generated method stub
	return null;
}


public Object setRecentPostCount(int i) {
	// TODO Auto-generated method stub
	return null;
}


public void setRecentPostCount(long l) {
	// TODO Auto-generated method stub
	
}


public void setTag(String notPresentTag) {
	// TODO Auto-generated method stub
	
}
}
