# node_module이 만들어짐

# Node.js 10 기반 이미지 사용
FROM node:10

# 작업 디렉토리 설정
WORKDIR /user/src/app

# 소스 코드 복사
COPY ./ ./
# COPY package.json ./

# 의존성 설치
RUN npm install

# 나머지 소스 코드 복사
# COPY . .

# 컨테이너 시작 시 실행할 명령어d
CMD [ "node", "server.js" ]