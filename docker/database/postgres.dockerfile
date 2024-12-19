FROM postgres:15.3

COPY persistence/src/main/resources/migrations/* /docker-entrypoint-initdb.d/