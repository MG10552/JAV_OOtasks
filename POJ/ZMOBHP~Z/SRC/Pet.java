  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>NativeEventDemo/src/Pet.java at master · Tokiya/NativeEventDemo · GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <link rel="logo" type="image/svg" href="http://github-media-downloads.s3.amazonaws.com/github-logo.svg" />
    <link rel="xhr-socket" href="/_sockets" />


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" />

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="6IbvtCtU39TB0bwCzhycwO247I0A6oxkkglFGL3ke+g=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/assets/github-159290696eb4150b6abdc4ac7fa8da500bcca10f.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/assets/github2-21be1ddb6396c340f389430eb4f465e34b778329.css" media="all" rel="stylesheet" type="text/css" />
    


      <script src="https://a248.e.akamai.net/assets.github.com/assets/frameworks-92d138f450f2960501e28397a2f63b0f100590f0.js" type="text/javascript"></script>
      <script src="https://a248.e.akamai.net/assets.github.com/assets/github-96584b7e42932c33acd470abba115f766a577fd7.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="e6f5dd9ec79a3f28962f9ad2031aacbb">

        <link data-pjax-transient rel='permalink' href='/Tokiya/NativeEventDemo/blob/a9bfb9e079cdfa06d1e5c41ea74072943bcbe942/src/Pet.java'>
    <meta property="og:title" content="NativeEventDemo"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/Tokiya/NativeEventDemo"/>
    <meta property="og:image" content="https://secure.gravatar.com/avatar/d889ec70cefae5f0913736f69473e14c?s=420&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="Contribute to NativeEventDemo development by creating an account on GitHub."/>
    <meta property="twitter:card" content="summary"/>
    <meta property="twitter:site" content="@GitHub">
    <meta property="twitter:title" content="Tokiya/NativeEventDemo"/>

    <meta name="description" content="Contribute to NativeEventDemo development by creating an account on GitHub." />


    <meta content="1121786" name="octolytics-dimension-user_id" /><meta content="10261401" name="octolytics-dimension-repository_id" />
  <link href="https://github.com/Tokiya/NativeEventDemo/commits/master.atom" rel="alternate" title="Recent Commits to NativeEventDemo:master" type="application/atom+xml" />

  </head>


  <body class="logged_out page-blob linux vis-public env-production  ">
    <div id="wrapper">

      
      
      

      
      <div class="header header-logged-out">
  <div class="container clearfix">

    <a class="header-logo-wordmark" href="https://github.com/">Github</a>

    <div class="header-actions">
      <a class="button primary" href="/signup">Sign up</a>
      <a class="button" href="/login?return_to=%2FTokiya%2FNativeEventDemo%2Fblob%2Fmaster%2Fsrc%2FPet.java">Sign in</a>
    </div>

    <div class="command-bar js-command-bar  in-repository">


      <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
        <li class="features"><a href="/features">Features</a></li>
          <li class="enterprise"><a href="http://enterprise.github.com/">Enterprise</a></li>
          <li class="blog"><a href="/blog">Blog</a></li>
      </ul>
        <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">
  <a href="/search/advanced" class="advanced-search-icon tooltipped downwards command-bar-search" id="advanced_search" title="Advanced search"><span class="octicon octicon-gear "></span></a>

  <input type="text" data-hotkey="/ s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
      data-repo="Tokiya/NativeEventDemo"
      data-branch="master"
      data-sha="110e701f201c086098a0950a6db5927cded2c6a1"
  >

    <input type="hidden" name="nwo" value="Tokiya/NativeEventDemo" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="octicon help tooltipped downwards" title="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

  <div class="divider-vertical"></div>

</form>
    </div>

  </div>
</div>


      


            <div class="site hfeed" itemscope itemtype="http://schema.org/WebPage">
      <div class="hentry">
        
        <div class="pagehead repohead instapaper_ignore readability-menu ">
          <div class="container">
            <div class="title-actions-bar">
              

<ul class="pagehead-actions">



    <li>
      <a href="/login?return_to=%2FTokiya%2FNativeEventDemo"
        class="minibutton js-toggler-target star-button entice tooltipped upwards"
        title="You must be signed in to use this feature" rel="nofollow">
        <span class="octicon octicon-star"></span>Star
      </a>
      <a class="social-count js-social-count" href="/Tokiya/NativeEventDemo/stargazers">
        0
      </a>
    </li>
    <li>
      <a href="/login?return_to=%2FTokiya%2FNativeEventDemo"
        class="minibutton js-toggler-target fork-button entice tooltipped upwards"
        title="You must be signed in to fork a repository" rel="nofollow">
        <span class="octicon octicon-git-branch"></span>Fork
      </a>
      <a href="/Tokiya/NativeEventDemo/network" class="social-count">
        0
      </a>
    </li>
</ul>

              <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
                <span class="repo-label"><span>public</span></span>
                <span class="mega-octicon octicon-repo"></span>
                <span class="author vcard">
                  <a href="/Tokiya" class="url fn" itemprop="url" rel="author">
                  <span itemprop="title">Tokiya</span>
                  </a></span> /
                <strong><a href="/Tokiya/NativeEventDemo" class="js-current-repository">NativeEventDemo</a></strong>
              </h1>
            </div>

            
  <ul class="tabs">
    <li class="pulse-nav"><a href="/Tokiya/NativeEventDemo/pulse" class="js-selected-navigation-item " data-selected-links="pulse /Tokiya/NativeEventDemo/pulse" rel="nofollow"><span class="octicon octicon-pulse"></span></a></li>
    <li><a href="/Tokiya/NativeEventDemo" class="js-selected-navigation-item selected" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /Tokiya/NativeEventDemo">Code</a></li>
    <li><a href="/Tokiya/NativeEventDemo/network" class="js-selected-navigation-item " data-selected-links="repo_network /Tokiya/NativeEventDemo/network">Network</a></li>
    <li><a href="/Tokiya/NativeEventDemo/pulls" class="js-selected-navigation-item " data-selected-links="repo_pulls /Tokiya/NativeEventDemo/pulls">Pull Requests <span class='counter'>0</span></a></li>

      <li><a href="/Tokiya/NativeEventDemo/issues" class="js-selected-navigation-item " data-selected-links="repo_issues /Tokiya/NativeEventDemo/issues">Issues <span class='counter'>0</span></a></li>



    <li><a href="/Tokiya/NativeEventDemo/graphs" class="js-selected-navigation-item " data-selected-links="repo_graphs repo_contributors /Tokiya/NativeEventDemo/graphs">Graphs</a></li>


  </ul>
  
<div class="tabnav">

  <span class="tabnav-right">
    <ul class="tabnav-tabs">
          <li><a href="/Tokiya/NativeEventDemo/tags" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_tags /Tokiya/NativeEventDemo/tags">Tags <span class="counter blank">0</span></a></li>
    </ul>
  </span>

  <div class="tabnav-widget scope">


    <div class="select-menu js-menu-container js-select-menu js-branch-menu">
      <a class="minibutton select-menu-button js-menu-target" data-hotkey="w" data-ref="master">
        <span class="octicon octicon-branch"></span>
        <i>branch:</i>
        <span class="js-select-button">master</span>
      </a>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container">

        <div class="select-menu-modal">
          <div class="select-menu-header">
            <span class="select-menu-title">Switch branches/tags</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-filters">
            <div class="select-menu-text-filter">
              <input type="text" id="commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
            </div>
            <div class="select-menu-tabs">
              <ul>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
                </li>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
                </li>
              </ul>
            </div><!-- /.select-menu-tabs -->
          </div><!-- /.select-menu-filters -->

          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="branches">

            <div data-filterable-for="commitish-filter-field" data-filterable-type="substring">

                <div class="select-menu-item js-navigation-item selected">
                  <span class="select-menu-item-icon octicon octicon-check"></span>
                  <a href="/Tokiya/NativeEventDemo/blob/master/src/Pet.java" class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target" data-name="master" rel="nofollow" title="master">master</a>
                </div> <!-- /.select-menu-item -->
            </div>

              <div class="select-menu-no-results">Nothing to show</div>
          </div> <!-- /.select-menu-list -->


          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="tags">
            <div data-filterable-for="commitish-filter-field" data-filterable-type="substring">

            </div>

            <div class="select-menu-no-results">Nothing to show</div>

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

  </div> <!-- /.scope -->

  <ul class="tabnav-tabs">
    <li><a href="/Tokiya/NativeEventDemo" class="selected js-selected-navigation-item tabnav-tab" data-selected-links="repo_source /Tokiya/NativeEventDemo">Files</a></li>
    <li><a href="/Tokiya/NativeEventDemo/commits/master" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_commits /Tokiya/NativeEventDemo/commits/master">Commits</a></li>
    <li><a href="/Tokiya/NativeEventDemo/branches" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_branches /Tokiya/NativeEventDemo/branches" rel="nofollow">Branches <span class="counter ">1</span></a></li>
  </ul>

</div>

  
  
  


            
          </div>
        </div><!-- /.repohead -->

        <div id="js-repo-pjax-container" class="container context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:29e3e1ec330acd83f9cc2508287174fe -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:29e3e1ec330acd83f9cc2508287174fe -->


<div id="slider">
    <div class="frame-meta">

      <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

        <div class="breadcrumb">
          <span class='bold'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/Tokiya/NativeEventDemo" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">NativeEventDemo</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/Tokiya/NativeEventDemo/tree/master/src" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><strong class="final-path">Pet.java</strong> <span class="js-zeroclipboard zeroclipboard-button" data-clipboard-text="src/Pet.java" data-copied-hint="copied!" title="copy to clipboard"><span class="octicon octicon-clippy"></span></span>
        </div>

      <a href="/Tokiya/NativeEventDemo/find/master" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>


        
  <div class="commit file-history-tease">
    <img class="main-avatar" height="24" src="https://secure.gravatar.com/avatar/d3fd1c4cb485145a49ad3334d641dd94?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="24" />
    <span class="author"><span rel="author">student</span></span>
    <time class="js-relative-date" datetime="2013-05-24T00:27:48-07:00" title="2013-05-24 00:27:48">May 24, 2013</time>
    <div class="commit-title">
        <a href="/Tokiya/NativeEventDemo/commit/a9bfb9e079cdfa06d1e5c41ea74072943bcbe942" class="message">first commit</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>0</strong> contributors</a></p>
      
    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2>Users on GitHub who have contributed to this file</h2>
      <ul class="facebox-user-list">
      </ul>
    </div>
  </div>


    </div><!-- ./.frame-meta -->

    <div class="frames">
      <div class="frame" data-permalink-url="/Tokiya/NativeEventDemo/blob/a9bfb9e079cdfa06d1e5c41ea74072943bcbe942/src/Pet.java" data-title="NativeEventDemo/src/Pet.java at master · Tokiya/NativeEventDemo · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="octicon octicon-file-text"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>91 lines (72 sloc)</span>
                <span>1.392 kb</span>
              </div>
              <div class="actions">
                <div class="button-group">
                      <a class="minibutton js-entice" href=""
                         data-entice="You must be signed in and on a branch to make or propose changes">Edit</a>
                  <a href="/Tokiya/NativeEventDemo/raw/master/src/Pet.java" class="button minibutton " id="raw-url">Raw</a>
                    <a href="/Tokiya/NativeEventDemo/blame/master/src/Pet.java" class="button minibutton ">Blame</a>
                  <a href="/Tokiya/NativeEventDemo/commits/master/src/Pet.java" class="button minibutton " rel="nofollow">History</a>
                </div><!-- /.button-group -->
              </div><!-- /.actions -->

            </div>
                <div class="blob-wrapper data type-java js-blob-data">
      <table class="file-code file-diff">
        <tr class="file-code-line">
          <td class="blob-line-nums">
            <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>

          </td>
          <td class="blob-line-code">
                  <div class="highlight"><pre><div class='line' id='LC1'><span class="kn">import</span> <span class="nn">java.util.ArrayList</span><span class="o">;</span></div><div class='line' id='LC2'><span class="kn">import</span> <span class="nn">java.util.List</span><span class="o">;</span></div><div class='line' id='LC3'><br/></div><div class='line' id='LC4'><br/></div><div class='line' id='LC5'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Pet</span> <span class="o">{</span></div><div class='line' id='LC6'><br/></div><div class='line' id='LC7'>	<span class="kd">private</span> <span class="n">String</span> <span class="n">name</span><span class="o">;</span></div><div class='line' id='LC8'>	<span class="kd">private</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">PetListener</span><span class="o">&gt;</span> <span class="n">listeners</span><span class="o">;</span></div><div class='line' id='LC9'><br/></div><div class='line' id='LC10'>	<span class="kd">private</span> <span class="n">Thread</span> <span class="n">life</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Thread</span><span class="o">()</span></div><div class='line' id='LC11'>	<span class="o">{</span></div><div class='line' id='LC12'>		<span class="kd">public</span> <span class="kt">void</span> <span class="nf">run</span><span class="o">()</span></div><div class='line' id='LC13'>		<span class="o">{</span></div><div class='line' id='LC14'>			<span class="k">while</span><span class="o">(</span><span class="kc">true</span><span class="o">)</span></div><div class='line' id='LC15'>			<span class="o">{</span></div><div class='line' id='LC16'>				<span class="kt">int</span> <span class="n">r</span> <span class="o">=</span> <span class="o">(</span><span class="kt">int</span><span class="o">)(</span><span class="n">Math</span><span class="o">.</span><span class="na">random</span><span class="o">()*</span><span class="mi">3</span><span class="o">);</span></div><div class='line' id='LC17'>				<span class="k">switch</span><span class="o">(</span><span class="n">r</span><span class="o">)</span></div><div class='line' id='LC18'>				<span class="o">{</span></div><div class='line' id='LC19'>				<span class="k">case</span> <span class="mi">0</span><span class="o">:</span> <span class="n">hungry</span><span class="o">();</span><span class="k">break</span><span class="o">;</span></div><div class='line' id='LC20'>				<span class="k">case</span> <span class="mi">1</span><span class="o">:</span> <span class="n">bored</span><span class="o">();</span><span class="k">break</span><span class="o">;</span></div><div class='line' id='LC21'>				<span class="k">case</span> <span class="mi">2</span><span class="o">:</span> <span class="n">dirty</span><span class="o">();</span><span class="k">break</span><span class="o">;</span></div><div class='line' id='LC22'>				<span class="o">}</span></div><div class='line' id='LC23'>				<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC24'>					<span class="n">sleep</span><span class="o">(</span><span class="mi">3000</span><span class="o">);</span></div><div class='line' id='LC25'>				<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">InterruptedException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC26'>					<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC27'>				<span class="o">}</span></div><div class='line' id='LC28'>			<span class="o">}</span></div><div class='line' id='LC29'>		<span class="o">}</span></div><div class='line' id='LC30'><br/></div><div class='line' id='LC31'>	<span class="o">};</span></div><div class='line' id='LC32'><br/></div><div class='line' id='LC33'><br/></div><div class='line' id='LC34'>	<span class="kd">public</span> <span class="nf">Pet</span><span class="o">(</span><span class="n">String</span> <span class="n">name</span><span class="o">)</span></div><div class='line' id='LC35'>	<span class="o">{</span></div><div class='line' id='LC36'>		<span class="k">this</span><span class="o">.</span><span class="na">name</span><span class="o">=</span><span class="n">name</span><span class="o">;</span></div><div class='line' id='LC37'>		<span class="k">this</span><span class="o">.</span><span class="na">listeners</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">PetListener</span><span class="o">&gt;();</span></div><div class='line' id='LC38'>		<span class="n">life</span><span class="o">.</span><span class="na">start</span><span class="o">();</span></div><div class='line' id='LC39'><br/></div><div class='line' id='LC40'>	<span class="o">}</span></div><div class='line' id='LC41'><br/></div><div class='line' id='LC42'>	<span class="kd">public</span> <span class="n">String</span> <span class="nf">getName</span><span class="o">()</span></div><div class='line' id='LC43'>	<span class="o">{</span></div><div class='line' id='LC44'>		<span class="k">return</span> <span class="n">name</span><span class="o">;</span></div><div class='line' id='LC45'>	<span class="o">}</span></div><div class='line' id='LC46'><br/></div><div class='line' id='LC47'>	<span class="kd">public</span> <span class="kd">synchronized</span> <span class="kt">void</span> <span class="nf">addListener</span><span class="o">(</span><span class="n">PetListener</span> <span class="n">listener</span><span class="o">)</span></div><div class='line' id='LC48'>	<span class="o">{</span></div><div class='line' id='LC49'>		<span class="n">listeners</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">listener</span><span class="o">);</span></div><div class='line' id='LC50'>	<span class="o">}</span></div><div class='line' id='LC51'><br/></div><div class='line' id='LC52'>	<span class="kd">public</span> <span class="kd">synchronized</span> <span class="kt">void</span> <span class="nf">removeListener</span><span class="o">(</span><span class="n">PetListener</span> <span class="n">listener</span><span class="o">)</span></div><div class='line' id='LC53'>	<span class="o">{</span></div><div class='line' id='LC54'>		<span class="n">listeners</span><span class="o">.</span><span class="na">remove</span><span class="o">(</span><span class="n">listener</span><span class="o">);</span></div><div class='line' id='LC55'>	<span class="o">}</span></div><div class='line' id='LC56'><br/></div><div class='line' id='LC57'>	<span class="kd">protected</span> <span class="kd">synchronized</span> <span class="kt">void</span> <span class="nf">hungry</span><span class="o">()</span></div><div class='line' id='LC58'>	<span class="o">{</span></div><div class='line' id='LC59'>		<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;jestem głodny&quot;</span><span class="o">);</span></div><div class='line' id='LC60'>		<span class="n">PetEvent</span> <span class="n">e</span> <span class="o">=</span> <span class="k">new</span> <span class="n">PetEvent</span><span class="o">(</span><span class="k">this</span><span class="o">);</span></div><div class='line' id='LC61'>		<span class="k">for</span><span class="o">(</span><span class="n">PetListener</span> <span class="nl">l:</span> <span class="n">listeners</span><span class="o">)</span></div><div class='line' id='LC62'>		<span class="o">{</span></div><div class='line' id='LC63'>			<span class="n">l</span><span class="o">.</span><span class="na">petHungry</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></div><div class='line' id='LC64'>		<span class="o">}</span></div><div class='line' id='LC65'><br/></div><div class='line' id='LC66'>	<span class="o">}</span></div><div class='line' id='LC67'><br/></div><div class='line' id='LC68'>	<span class="kd">protected</span> <span class="kd">synchronized</span> <span class="kt">void</span> <span class="nf">bored</span><span class="o">()</span></div><div class='line' id='LC69'>	<span class="o">{</span></div><div class='line' id='LC70'>		<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;nudzi mi sie&quot;</span><span class="o">);</span></div><div class='line' id='LC71'>		<span class="n">PetEvent</span> <span class="n">e</span> <span class="o">=</span> <span class="k">new</span> <span class="n">PetEvent</span><span class="o">(</span><span class="k">this</span><span class="o">);</span></div><div class='line' id='LC72'>		<span class="k">for</span><span class="o">(</span><span class="n">PetListener</span> <span class="nl">l:</span> <span class="n">listeners</span><span class="o">)</span></div><div class='line' id='LC73'>		<span class="o">{</span></div><div class='line' id='LC74'>			<span class="n">l</span><span class="o">.</span><span class="na">petBored</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></div><div class='line' id='LC75'>		<span class="o">}</span></div><div class='line' id='LC76'><br/></div><div class='line' id='LC77'>	<span class="o">}</span></div><div class='line' id='LC78'><br/></div><div class='line' id='LC79'>	<span class="kd">protected</span> <span class="kd">synchronized</span> <span class="kt">void</span> <span class="nf">dirty</span><span class="o">()</span></div><div class='line' id='LC80'>	<span class="o">{</span></div><div class='line' id='LC81'>		<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;pobrudziłem sie&quot;</span><span class="o">);</span></div><div class='line' id='LC82'>		<span class="n">PetEvent</span> <span class="n">e</span> <span class="o">=</span> <span class="k">new</span> <span class="n">PetEvent</span><span class="o">(</span><span class="k">this</span><span class="o">);</span></div><div class='line' id='LC83'>		<span class="k">for</span><span class="o">(</span><span class="n">PetListener</span> <span class="nl">l:</span> <span class="n">listeners</span><span class="o">)</span></div><div class='line' id='LC84'>		<span class="o">{</span></div><div class='line' id='LC85'>			<span class="n">l</span><span class="o">.</span><span class="na">petDirty</span><span class="o">(</span><span class="n">e</span><span class="o">);</span></div><div class='line' id='LC86'>		<span class="o">}</span></div><div class='line' id='LC87'><br/></div><div class='line' id='LC88'>	<span class="o">}</span></div><div class='line' id='LC89'><br/></div><div class='line' id='LC90'><span class="o">}</span></div></pre></div>
          </td>
        </tr>
      </table>
  </div>

          </div>
        </div>

        <a href="#jump-to-line" rel="facebox" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
        <div id="jump-to-line" style="display:none">
          <h2>Jump to Line</h2>
          <form accept-charset="UTF-8" class="js-jump-to-line-form">
            <input class="textfield js-jump-to-line-field" type="text">
            <div class="full-button">
              <button type="submit" class="button">Go</button>
            </div>
          </form>
        </div>

      </div>
    </div>
</div>

<div id="js-frame-loading-template" class="frame frame-loading large-loading-area" style="display:none;">
  <img class="js-frame-loading-spinner" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-128.gif?1347543528" height="64" width="64">
</div>


        </div>
      </div>
      <div class="modal-backdrop"></div>
    </div>

      <div id="footer-push"></div><!-- hack for sticky footer -->
    </div><!-- end of wrapper - hack for sticky footer -->

      <!-- footer -->
      <div id="footer">
  <div class="container clearfix">

      <dl class="footer_nav">
        <dt>GitHub</dt>
        <dd><a href="/about">About us</a></dd>
        <dd><a href="/blog">Blog</a></dd>
        <dd><a href="/contact">Contact &amp; support</a></dd>
        <dd><a href="http://enterprise.github.com/">GitHub Enterprise</a></dd>
        <dd><a href="http://status.github.com/">Site status</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Applications</dt>
        <dd><a href="http://mac.github.com/">GitHub for Mac</a></dd>
        <dd><a href="http://windows.github.com/">GitHub for Windows</a></dd>
        <dd><a href="http://eclipse.github.com/">GitHub for Eclipse</a></dd>
        <dd><a href="http://mobile.github.com/">GitHub mobile apps</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Services</dt>
        <dd><a href="http://get.gaug.es/">Gauges: Web analytics</a></dd>
        <dd><a href="http://speakerdeck.com">Speaker Deck: Presentations</a></dd>
        <dd><a href="https://gist.github.com">Gist: Code snippets</a></dd>
        <dd><a href="http://jobs.github.com/">Job board</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Documentation</dt>
        <dd><a href="http://help.github.com/">GitHub Help</a></dd>
        <dd><a href="http://developer.github.com/">Developer API</a></dd>
        <dd><a href="http://github.github.com/github-flavored-markdown/">GitHub Flavored Markdown</a></dd>
        <dd><a href="http://pages.github.com/">GitHub Pages</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>More</dt>
        <dd><a href="http://training.github.com/">Training</a></dd>
        <dd><a href="/edu">Students &amp; teachers</a></dd>
        <dd><a href="http://shop.github.com">The Shop</a></dd>
        <dd><a href="/plans">Plans &amp; pricing</a></dd>
        <dd><a href="http://octodex.github.com/">The Octodex</a></dd>
      </dl>

      <hr class="footer-divider">


    <p class="right">&copy; 2013 <span title="0.03738s from fe1.rs.github.com">GitHub</span>, Inc. All rights reserved.</p>
    <a class="left" href="/">
      <span class="mega-octicon octicon-mark-github"></span>
    </a>
    <ul id="legal">
        <li><a href="/site/terms">Terms of Service</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
    </ul>

  </div><!-- /.container -->

</div><!-- /.#footer -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
          <div class="suggester-container">
              <div class="suggester fullscreen-suggester js-navigation-container" id="fullscreen_suggester"
                 data-url="/Tokiya/NativeEventDemo/suggestions/commit">
              </div>
          </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped leftwards" title="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped leftwards"
      title="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      Something went wrong with that request. Please try again.
      <a href="#" class="octicon octicon-remove-close ajax-error-dismiss"></a>
    </div>

    
    <span id='server_response_time' data-time='0.03775' data-host='fe1'></span>
    
  </body>
</html>

