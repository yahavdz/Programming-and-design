FROM jenkins/jenkins:lts

ENV DOCKER_VERSION 18.09.0
ENV DOCKER_CHANNEL stable
ENV DOCKER_ARCH x86_64

# install docker
RUN set -eux; \
  groupadd docker; \
  useradd -g docker docker; \
  usermod -aG docker ${user}; \
  if ! wget -O docker.tgz "https://download.docker.com/linux/static/${DOCKER_CHANNEL}/${DOCKER_ARCH}/docker-${DOCKER_VERSION}.tgz"; then \
    echo >&2 "error: failed to download 'docker-${DOCKER_VERSION}' from '${DOCKER_CHANNEL}' for '${DOCKER_ARCH}'"; \
    exit 1; \
  fi; \
  \
  tar --extract \
    --file docker.tgz \
    --strip-components 1 \
    --directory /usr/local/bin/ \
  ; \
  rm docker.tgz; \
  \
  dockerd --version; \
  docker --version; \
  wget -O /usr/local/bin/dind "https://raw.githubusercontent.com/docker/docker/${DIND_COMMIT}/hack/dind"; \
  chmod +x /usr/local/bin/dind

# always to use vfs storage
RUN mkdir -p /etc/docker
COPY daemon.json /etc/docker/daemon.json