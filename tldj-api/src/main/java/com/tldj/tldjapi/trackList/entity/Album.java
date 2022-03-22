package com.tldj.tldjapi.trackList.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "album")
@Getter
public class Album {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;

  private String description;

  @OneToMany(
      mappedBy = "album",
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )
  private List<Track> tracks;

  // constructor
  private Album(String title, String description) {
    this.title = title;
    this.description = description;
    tracks = new ArrayList<>();
  }

  public static Album create(String title, String description) {
    return new Album(title, description);
  }

  public void add(Track track) {
    track.setAlbum(this);
    tracks.add(track);
  }

  public void addAll(List<Track> tracks) {
    for(Track track : tracks) {
      add(track);
    }
  }

  // todo : 이거 제대로 되나 확인 해봐야 함.
  public void remove(Track track) {
    tracks.remove(track);
  }

}
