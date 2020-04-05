FROM node:10

RUN mkdir -p /src/app

WORKDIR /src/app

COPY package.json package-lock.json /src/app/

RUN npm install

COPY server.js /src/app

EXPOSE 3000

CMD [ "npm", "start" ]
