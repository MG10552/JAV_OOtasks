  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>LibraryProject/src/Main.java at master · Tokiya/LibraryProject · GitHub</title>
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

        <link data-pjax-transient rel='permalink' href='/Tokiya/LibraryProject/blob/643046e5e2c4012e2591dce3d69e8807f754ab7a/src/Main.java'>
    <meta property="og:title" content="LibraryProject"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/Tokiya/LibraryProject"/>
    <meta property="og:image" content="https://secure.gravatar.com/avatar/d889ec70cefae5f0913736f69473e14c?s=420&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="Contribute to LibraryProject development by creating an account on GitHub."/>
    <meta property="twitter:card" content="summary"/>
    <meta property="twitter:site" content="@GitHub">
    <meta property="twitter:title" content="Tokiya/LibraryProject"/>

    <meta name="description" content="Contribute to LibraryProject development by creating an account on GitHub." />


    <meta content="1121786" name="octolytics-dimension-user_id" /><meta content="9388975" name="octolytics-dimension-repository_id" />
  <link href="https://github.com/Tokiya/LibraryProject/commits/master.atom" rel="alternate" title="Recent Commits to LibraryProject:master" type="application/atom+xml" />

  </head>


  <body class="logged_out page-blob linux vis-public env-production  ">
    <div id="wrapper">

      
      
      

      
      <div class="header header-logged-out">
  <div class="container clearfix">

    <a class="header-logo-wordmark" href="https://github.com/">Github</a>

    <div class="header-actions">
      <a class="button primary" href="/signup">Sign up</a>
      <a class="button" href="/login?return_to=%2FTokiya%2FLibraryProject%2Fblob%2Fmaster%2Fsrc%2FMain.java">Sign in</a>
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
    
      data-repo="Tokiya/LibraryProject"
      data-branch="master"
      data-sha="1b5d6e0530f22a0fb6d889ac4d27078cceec3c27"
  >

    <input type="hidden" name="nwo" value="Tokiya/LibraryProject" />

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
      <a href="/login?return_to=%2FTokiya%2FLibraryProject"
        class="minibutton js-toggler-target star-button entice tooltipped upwards"
        title="You must be signed in to use this feature" rel="nofollow">
        <span class="octicon octicon-star"></span>Star
      </a>
      <a class="social-count js-social-count" href="/Tokiya/LibraryProject/stargazers">
        0
      </a>
    </li>
    <li>
      <a href="/login?return_to=%2FTokiya%2FLibraryProject"
        class="minibutton js-toggler-target fork-button entice tooltipped upwards"
        title="You must be signed in to fork a repository" rel="nofollow">
        <span class="octicon octicon-git-branch"></span>Fork
      </a>
      <a href="/Tokiya/LibraryProject/network" class="social-count">
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
                <strong><a href="/Tokiya/LibraryProject" class="js-current-repository">LibraryProject</a></strong>
              </h1>
            </div>

            
  <ul class="tabs">
    <li class="pulse-nav"><a href="/Tokiya/LibraryProject/pulse" class="js-selected-navigation-item " data-selected-links="pulse /Tokiya/LibraryProject/pulse" rel="nofollow"><span class="octicon octicon-pulse"></span></a></li>
    <li><a href="/Tokiya/LibraryProject" class="js-selected-navigation-item selected" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /Tokiya/LibraryProject">Code</a></li>
    <li><a href="/Tokiya/LibraryProject/network" class="js-selected-navigation-item " data-selected-links="repo_network /Tokiya/LibraryProject/network">Network</a></li>
    <li><a href="/Tokiya/LibraryProject/pulls" class="js-selected-navigation-item " data-selected-links="repo_pulls /Tokiya/LibraryProject/pulls">Pull Requests <span class='counter'>0</span></a></li>

      <li><a href="/Tokiya/LibraryProject/issues" class="js-selected-navigation-item " data-selected-links="repo_issues /Tokiya/LibraryProject/issues">Issues <span class='counter'>0</span></a></li>



    <li><a href="/Tokiya/LibraryProject/graphs" class="js-selected-navigation-item " data-selected-links="repo_graphs repo_contributors /Tokiya/LibraryProject/graphs">Graphs</a></li>


  </ul>
  
<div class="tabnav">

  <span class="tabnav-right">
    <ul class="tabnav-tabs">
          <li><a href="/Tokiya/LibraryProject/tags" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_tags /Tokiya/LibraryProject/tags">Tags <span class="counter blank">0</span></a></li>
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
                  <a href="/Tokiya/LibraryProject/blob/master/src/Main.java" class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target" data-name="master" rel="nofollow" title="master">master</a>
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
    <li><a href="/Tokiya/LibraryProject" class="selected js-selected-navigation-item tabnav-tab" data-selected-links="repo_source /Tokiya/LibraryProject">Files</a></li>
    <li><a href="/Tokiya/LibraryProject/commits/master" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_commits /Tokiya/LibraryProject/commits/master">Commits</a></li>
    <li><a href="/Tokiya/LibraryProject/branches" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_branches /Tokiya/LibraryProject/branches" rel="nofollow">Branches <span class="counter ">1</span></a></li>
  </ul>

</div>

  
  
  


            
          </div>
        </div><!-- /.repohead -->

        <div id="js-repo-pjax-container" class="container context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:0066cd7910504de7ac645127123cf2a0 -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:0066cd7910504de7ac645127123cf2a0 -->


<div id="slider">
    <div class="frame-meta">

      <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

        <div class="breadcrumb">
          <span class='bold'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/Tokiya/LibraryProject" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">LibraryProject</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/Tokiya/LibraryProject/tree/master/src" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><strong class="final-path">Main.java</strong> <span class="js-zeroclipboard zeroclipboard-button" data-clipboard-text="src/Main.java" data-copied-hint="copied!" title="copy to clipboard"><span class="octicon octicon-clippy"></span></span>
        </div>

      <a href="/Tokiya/LibraryProject/find/master" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>


        <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/Tokiya/LibraryProject/contributors/master/src/Main.java">
          Fetching contributors…

          <div class="participation">
            <p class="loader-loading"><img alt="Octocat-spinner-32-eaf2f5" height="16" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif?1359500886" width="16" /></p>
            <p class="loader-error">Cannot retrieve contributors at this time</p>
          </div>
        </div>

    </div><!-- ./.frame-meta -->

    <div class="frames">
      <div class="frame" data-permalink-url="/Tokiya/LibraryProject/blob/643046e5e2c4012e2591dce3d69e8807f754ab7a/src/Main.java" data-title="LibraryProject/src/Main.java at master · Tokiya/LibraryProject · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="octicon octicon-file-text"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>48 lines (32 sloc)</span>
                <span>0.849 kb</span>
              </div>
              <div class="actions">
                <div class="button-group">
                      <a class="minibutton js-entice" href=""
                         data-entice="You must be signed in and on a branch to make or propose changes">Edit</a>
                  <a href="/Tokiya/LibraryProject/raw/master/src/Main.java" class="button minibutton " id="raw-url">Raw</a>
                    <a href="/Tokiya/LibraryProject/blame/master/src/Main.java" class="button minibutton ">Blame</a>
                  <a href="/Tokiya/LibraryProject/commits/master/src/Main.java" class="button minibutton " rel="nofollow">History</a>
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

          </td>
          <td class="blob-line-code">
                  <div class="highlight"><pre><div class='line' id='LC1'><span class="kn">import</span> <span class="nn">java.util.ArrayList</span><span class="o">;</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">database.BookManager</span><span class="o">;</span></div><div class='line' id='LC4'><span class="kn">import</span> <span class="nn">database.IManager</span><span class="o">;</span></div><div class='line' id='LC5'><span class="kn">import</span> <span class="nn">database.MockDb</span><span class="o">;</span></div><div class='line' id='LC6'><br/></div><div class='line' id='LC7'><span class="kn">import</span> <span class="nn">model.*</span><span class="o">;</span></div><div class='line' id='LC8'><br/></div><div class='line' id='LC9'><br/></div><div class='line' id='LC10'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Main</span> <span class="o">{</span></div><div class='line' id='LC11'><br/></div><div class='line' id='LC12'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="o">(</span><span class="n">String</span><span class="o">[]</span> <span class="n">args</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC13'><br/></div><div class='line' id='LC14'>		<span class="n">Book</span> <span class="n">book</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Book</span><span class="o">();</span></div><div class='line' id='LC15'><br/></div><div class='line' id='LC16'>		<span class="n">book</span><span class="o">.</span><span class="na">setTitle</span><span class="o">(</span><span class="s">&quot;Thinking in java&quot;</span><span class="o">);</span></div><div class='line' id='LC17'>		<span class="n">book</span><span class="o">.</span><span class="na">setPublisher</span><span class="o">(</span><span class="s">&quot;PWN&quot;</span><span class="o">);</span></div><div class='line' id='LC18'>		<span class="n">book</span><span class="o">.</span><span class="na">setYear</span><span class="o">(</span><span class="mi">2013</span><span class="o">);</span></div><div class='line' id='LC19'>		<span class="n">Author</span> <span class="n">a</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Author</span><span class="o">();</span></div><div class='line' id='LC20'>		<span class="n">a</span><span class="o">.</span><span class="na">setName</span><span class="o">(</span><span class="s">&quot;Bruce&quot;</span><span class="o">);</span></div><div class='line' id='LC21'>		<span class="n">a</span><span class="o">.</span><span class="na">setSurname</span><span class="o">(</span><span class="s">&quot;Eckel&quot;</span><span class="o">);</span></div><div class='line' id='LC22'>		<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">Author</span><span class="o">&gt;</span> <span class="n">authors</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">();</span></div><div class='line' id='LC23'>		<span class="n">authors</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">a</span><span class="o">);</span></div><div class='line' id='LC24'>		<span class="n">book</span><span class="o">.</span><span class="na">setAuthors</span><span class="o">(</span><span class="n">authors</span><span class="o">);</span></div><div class='line' id='LC25'><br/></div><div class='line' id='LC26'>		<span class="n">Magazine</span> <span class="n">m</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Magazine</span><span class="o">();</span></div><div class='line' id='LC27'>		<span class="n">m</span><span class="o">.</span><span class="na">setTitle</span><span class="o">(</span><span class="s">&quot;Programista&quot;</span><span class="o">);</span></div><div class='line' id='LC28'>		<span class="n">m</span><span class="o">.</span><span class="na">setNumber</span><span class="o">(</span><span class="mi">10</span><span class="o">);</span></div><div class='line' id='LC29'>		<span class="n">m</span><span class="o">.</span><span class="na">setTypeOfMagazine</span><span class="o">(</span><span class="n">MagazineType</span><span class="o">.</span><span class="na">miesiecznik</span><span class="o">);</span></div><div class='line' id='LC30'>		<span class="n">m</span><span class="o">.</span><span class="na">setYear</span><span class="o">(</span><span class="mi">2013</span><span class="o">);</span></div><div class='line' id='LC31'><br/></div><div class='line' id='LC32'>		<span class="n">MockDb</span> <span class="n">db</span> <span class="o">=</span> <span class="k">new</span> <span class="n">MockDb</span><span class="o">();</span></div><div class='line' id='LC33'><br/></div><div class='line' id='LC34'>		<span class="n">db</span><span class="o">.</span><span class="na">save</span><span class="o">(</span><span class="n">m</span><span class="o">);</span></div><div class='line' id='LC35'>		<span class="n">db</span><span class="o">.</span><span class="na">save</span><span class="o">(</span><span class="n">book</span><span class="o">);</span></div><div class='line' id='LC36'><br/></div><div class='line' id='LC37'>		<span class="n">IManager</span><span class="o">&lt;</span><span class="n">Book</span><span class="o">&gt;</span> <span class="n">bookMgr</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BookManager</span><span class="o">();</span></div><div class='line' id='LC38'><br/></div><div class='line' id='LC39'>		<span class="k">for</span><span class="o">(</span><span class="n">LibraryItem</span> <span class="nl">item:</span> <span class="n">bookMgr</span><span class="o">.</span><span class="na">getAll</span><span class="o">())</span></div><div class='line' id='LC40'>		<span class="o">{</span>			</div><div class='line' id='LC41'>			<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="n">item</span><span class="o">.</span><span class="na">show</span><span class="o">()+</span><span class="s">&quot;\n&quot;</span><span class="o">);</span></div><div class='line' id='LC42'>		<span class="o">}</span></div><div class='line' id='LC43'><br/></div><div class='line' id='LC44'><br/></div><div class='line' id='LC45'>	<span class="o">}</span></div><div class='line' id='LC46'><br/></div><div class='line' id='LC47'><span class="o">}</span></div></pre></div>
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
  <img class="js-frame-loading-spinner" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-128.gif?1359500886" height="64" width="64">
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


    <p class="right">&copy; 2013 <span title="0.08992s from fe19.rs.github.com">GitHub</span>, Inc. All rights reserved.</p>
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
                 data-url="/Tokiya/LibraryProject/suggestions/commit">
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

    
    <span id='server_response_time' data-time='0.09031' data-host='fe19'></span>
    
  </body>
</html>

