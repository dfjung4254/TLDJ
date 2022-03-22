FROM amazoncorretto:11

## default server settings
## RUN apt-get update && apt-get -y upgrade

ENV TLDJ_PASSWORD=TODO
ENV HOME=/app

RUN mkdir -p $HOME
WORKDIR $HOME

COPY . .

CMD ./gradlew bootRun
