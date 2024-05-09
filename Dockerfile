FROM bellsoft/liberica-openjdk-alpine-musl
COPY ./target/MosBirja-1.0.0-SNAPSHOT.jar .
CMD ["java","-jar","MosBirja-1.0.0-SNAPSHOT.jar"]