<template>
    <div class="navBar">
        <div class="header-inner">
            <div class="header-logo">
                <img src="https://www.peaks.fr/wp-content/themes/peaks/assets/images/logo-peaks.svg"
                     alt="" width="150" height="45">
            </div>
            <nav class="header-nav">
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="https://www.peaks.fr/en/qui-sommes-nous/">About Peaks</a></li>
                    <li><a href="https://www.peaks.fr/en/contact/">Contact</a></li>
                    <li><a v-b-toggle.collapse1 variant="primaire">Sign - in</a></li>
                </ul>
            </nav>
        </div>
        <div>
            <b-collapse id="collapse1" class="mt-2">
                <b-card>
                    <SignIn/>
                </b-card>
            </b-collapse>
            <div>
                <!--To import an other component  ==> -->
                <Home msg="Robert"/>
            </div>
        </div>
    </div>
</template>
<script>
    // @ is an alias to /src
    //To import an other component
    import Home from '@/components/home/Home.vue';
    import SignIn from '@/components/sign-in/SignIn.vue';
    export default {
        name: 'navBar',
        components: {
            Home,
            SignIn
        },
        data() {
            return {
                showCollapse: true
            }
        }
    };
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
        scroll-behavior: smooth;
    }

    .header-inner {
        display: table;
        width: 100%;
        margin: 0 auto;
        background: #F7F9FC;
        position: sticky;
        top: 0;
        text-align: center;
    }

    .header-inner > * {
        display: table-cell;
        vertical-align: middle;
    }

    .header-nav {
        text-align: right;
    }

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

    /* Links */
    .header-nav a:after {
        content: "";
        position: absolute;
        bottom: 0;
        right: 20px;
        left: 20px;
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

    @keyframes stickAnim {
        0% {
            transform: translateY(-86px);
        }
        100% {
            transform: translateY(0);
        }
    }

</style>
