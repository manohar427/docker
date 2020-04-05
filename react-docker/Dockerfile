FROM node:10

RUN mkdir -p /src/apps

WORKDIR /src/apps

COPY . /src/apps/

RUN yarn install



EXPOSE 3000

CMD [ "npm", "start" ]
