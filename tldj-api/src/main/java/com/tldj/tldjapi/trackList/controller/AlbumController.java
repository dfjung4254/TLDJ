package com.tldj.tldjapi.trackList.controller;

import com.tldj.tldjapi.trackList.dto.AlbumDto;
import com.tldj.tldjapi.trackList.entity.Album;
import com.tldj.tldjapi.trackList.service.AlbumService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/album")
@RequiredArgsConstructor
public class AlbumController {

  private AlbumService albumService;

  @PostMapping
  public ResponseEntity<AlbumDto> create(@Valid @RequestBody AlbumDto albumDto) {

    Album album = Album.of(albumDto);
    Album createdAlbum = albumService.create(album);
    AlbumDto responseBody = AlbumDto.of(createdAlbum);

    return ResponseEntity.status(HttpStatus.OK)
        .body(responseBody);
  }

}
