package com.tldj.tldjapi.trackList.dto;

import com.tldj.tldjapi.core.track.Genre;
import com.tldj.tldjapi.trackList.entity.Track;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TrackDto {

  private Long id;

  @NotBlank
  @Size(min = 1, max = 200)
  private String name;

  @NotNull
  @PositiveOrZero
  private Long playTime;

  @NotNull
  private Genre genre;

  @NotBlank
  @Size(min = 1, max = 200)
  private String author;

  public static TrackDto of(Long id, String name, Long playTime, Genre genre, String author) {
    return new TrackDto(id, name, playTime, genre, author);
  }

  public static TrackDto of(Track track) {
    return new TrackDto(
        track.getId(), track.getName(), track.getPlayTime(), track.getGenre(), track.getAuthor());
  }
}
