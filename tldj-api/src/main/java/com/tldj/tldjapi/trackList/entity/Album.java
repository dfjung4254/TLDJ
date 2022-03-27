package com.tldj.tldjapi.trackList.entity;

import com.tldj.tldjapi.trackList.dto.AlbumDto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "album")
@Getter @Setter
@NoArgsConstructor
public class Album {

  @Id
  @GeneratedValue
  private Long id;

  private String title;

  private String description;

  private String author;

  private Album(Long id, String title, String description, String author) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.author = author;
  }

  public static Album of(AlbumDto albumDto) {
    return new Album(
        albumDto.getId(),
        albumDto.getTitle(),
        albumDto.getDescription(),
        albumDto.getAuthor()
    );
  }

}
