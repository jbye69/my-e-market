<template>
  <div class="home">
    <header id="header" role="banner" class="main-header">
      <div class="header-inner">

        <div class="header-logo">
          <img src="https://www.peaks.fr/wp-content/themes/peaks/assets/images/logo-peaks.svg" alt="Creative Juiz" width="150" height="45">
        </div>

        <nav class="header-nav">
          <ul>
            <li><a href="#">Home</a></li>
            <li><a href="https://www.peaks.fr/en/qui-sommes-nous/">About Peaks</a></li>
            <li><a href="https://www.peaks.fr/en/contact/">Contact</a></li>
          </ul>
        </nav>

      </div>
    </header>
    <HelloWorld msg="Welcome to Your Vue.js + TypeScript App"/>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src

@Component({
  components: {
    HelloWorld,
  },
})
export default class Home extends Vue {
  function (w, d, undefined) {

  } (window, document)
}
</script>
<style lang="css">
  /* Reset Style */
* {
  box-sizing: border-box;
}
  html, body, ul {
    padding: 0;
    margin: 0;
  }

  /* Start  */
  body {
    font-family: Catamaran, sans-serif;
    line-height: 1.75;
    background: #F7F9FC;
  }
  .main-header {
    color: #373737;
    background: #F7F9FC;
  }
  /* Put elements next to each other  */
  .header-inner {
    display: table;
    width: 100%;
    max-width: 1100px;
    margin: 0 auto;
    padding: 20px 25px;
  }
  .header-inner > * {
    display: table-cell;
    vertical-align: middle;
  }
  /* Alignement du menu */
  .header-nav {
    text-align: right;
  }
  /*
  align items to right
  */
  .header-nav ul, .header-nav li {
    display: inline;
    list-style: none;
  }
  .header-nav a {
    position: relative;
    display: inline-block;
    padding: 8px 20px;
    vertical-align: middle;
    font-weight: 300; /* entre regular et light */
    letter-spacing: 0.025em;
    color: inherit;
    text-decoration: none;
  }
  /*  Animations */
  .header-nav a:after {
    content: "";
    position: absolute;
    bottom: 0; right: 20px; left: 20px;
    height: 2px;
    background-color: #E74E96;

    opacity: 0;
    transform: translateY(8px);
    transition: all .30s;
  }
  /* On hover before */
  .header-nav a:hover:after,
  .header-nav a:focus:after {
    opacity: .8;
    transform: translateY(0);
  }
</style>
