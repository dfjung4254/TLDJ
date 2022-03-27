package com.tldj.tldjapi.trackList.entity;

import com.tldj.tldjapi.core.track.Genre;
import com.tldj.tldjapi.trackList.dto.TrackDto;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "track")
@Getter @Setter
@NoArgsConstructor
public class Track {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @Enumerated(EnumType.STRING)
  private Genre genre;

  private String author;

  private Long playTime;

  private Track(Long id, String name, Long playTime, Genre genre, String author) {
    this.id = id;
    this.name = name;
    this.playTime = playTime;
    this.genre = genre;
    this.author = author;
  }

  public static Track of(TrackDto trackDto) {
    return new Track(
        trackDto.getId(),
        trackDto.getName(),
        trackDto.getPlayTime(),
        trackDto.getGenre(),
        trackDto.getAuthor()
    );
  }

}
