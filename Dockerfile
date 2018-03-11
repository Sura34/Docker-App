FROM openjdk:8-jdk-alpine


COPY Min.java .

RUN javac Min.java
CMD java Min

