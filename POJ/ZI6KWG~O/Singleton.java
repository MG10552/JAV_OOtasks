  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>ThreadDeom/src/Singleton.java at master · Tokiya/ThreadDeom · GitHub</title>
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

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="6IbvtCtU39TB0bwCzhycwO247I0A6oxkkglFGL3ke+g=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/assets/github-f83886f99df2d49d9d4ab1f16f2ecbeef5be3c9e.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/assets/github2-ab0d668c4e85d800512d0a4597c0821632736ae6.css" media="all" rel="stylesheet" type="text/css" />
    


      <script src="https://a248.e.akamai.net/assets.github.com/assets/frameworks-92d138f450f2960501e28397a2f63b0f100590f0.js" type="text/javascript"></script>
      <script src="https://a248.e.akamai.net/assets.github.com/assets/github-cb4775af41c6df8a5a7a2399bb8399da5e4a94e2.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="abf9b8fa5fc699ddca81c0758ac5ff03">

        <link data-pjax-transient rel='permalink' href='/Tokiya/ThreadDeom/blob/a3a7770e9d6e85c90b0a78ba398ae8b8ffe52e51/src/Singleton.java'>
    <meta property="og:title" content="ThreadDeom"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/Tokiya/ThreadDeom"/>
    <meta property="og:image" content="https://secure.gravatar.com/avatar/d889ec70cefae5f0913736f69473e14c?s=420&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="Contribute to ThreadDeom development by creating an account on GitHub."/>
    <meta property="twitter:card" content="summary"/>
    <meta property="twitter:site" content="@GitHub">
    <meta property="twitter:title" content="Tokiya/ThreadDeom"/>

    <meta name="description" content="Contribute to ThreadDeom development by creating an account on GitHub." />

  <link href="https://github.com/Tokiya/ThreadDeom/commits/master.atom" rel="alternate" title="Recent Commits to ThreadDeom:master" type="application/atom+xml" />

  </head>


  <body class="logged_out page-blob linux vis-public env-production  ">
    <div id="wrapper">

      

      
      
      

      
      <div class="header header-logged-out">
  <div class="container clearfix">

    <a class="header-logo-wordmark" href="https://github.com/">Github</a>

    <div class="header-actions">
        <a class="button primary" href="https://github.com/signup">Sign up for free</a>
      <a class="button" href="https://github.com/login?return_to=%2FTokiya%2FThreadDeom%2Fblob%2Fmaster%2Fsrc%2FSingleton.java">Sign in</a>
    </div>

      <ul class="top-nav">
          <li class="explore"><a href="https://github.com/explore">Explore GitHub</a></li>
        <li class="search"><a href="https://github.com/search">Search</a></li>
        <li class="features"><a href="https://github.com/features">Features</a></li>
          <li class="blog"><a href="https://github.com/blog">Blog</a></li>
      </ul>

  </div>
</div>


      

      


            <div class="site hfeed" itemscope itemtype="http://schema.org/WebPage">
      <div class="hentry">
        
        <div class="pagehead repohead instapaper_ignore readability-menu ">
          <div class="container">
            <div class="title-actions-bar">
              

<ul class="pagehead-actions">



    <li>
      <a href="/login?return_to=%2FTokiya%2FThreadDeom"
        class="minibutton js-toggler-target star-button entice tooltipped upwards"
        title="You must be signed in to use this feature" rel="nofollow">
        <span class="mini-icon mini-icon-star"></span>Star
      </a>
      <a class="social-count js-social-count" href="/Tokiya/ThreadDeom/stargazers">
        0
      </a>
    </li>
    <li>
      <a href="/login?return_to=%2FTokiya%2FThreadDeom"
        class="minibutton js-toggler-target fork-button entice tooltipped upwards"
        title="You must be signed in to fork a repository" rel="nofollow">
        <span class="mini-icon mini-icon-fork"></span>Fork
      </a>
      <a href="/Tokiya/ThreadDeom/network" class="social-count">
        0
      </a>
    </li>
</ul>

              <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
                <span class="repo-label"><span>public</span></span>
                <span class="mega-icon mega-icon-public-repo"></span>
                <span class="author vcard">
                  <a href="/Tokiya" class="url fn" itemprop="url" rel="author">
                  <span itemprop="title">Tokiya</span>
                  </a></span> /
                <strong><a href="/Tokiya/ThreadDeom" class="js-current-repository">ThreadDeom</a></strong>
              </h1>
            </div>

            
  <ul class="tabs">
    <li class="pulse-nav"><a href="/Tokiya/ThreadDeom/pulse" class="js-selected-navigation-item " data-selected-links="pulse /Tokiya/ThreadDeom/pulse" rel="nofollow"><span class="mini-icon mini-icon-pulse"></span></a></li>
    <li><a href="/Tokiya/ThreadDeom" class="js-selected-navigation-item selected" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /Tokiya/ThreadDeom">Code</a></li>
    <li><a href="/Tokiya/ThreadDeom/network" class="js-selected-navigation-item " data-selected-links="repo_network /Tokiya/ThreadDeom/network">Network</a></li>
    <li><a href="/Tokiya/ThreadDeom/pulls" class="js-selected-navigation-item " data-selected-links="repo_pulls /Tokiya/ThreadDeom/pulls">Pull Requests <span class='counter'>0</span></a></li>

      <li><a href="/Tokiya/ThreadDeom/issues" class="js-selected-navigation-item " data-selected-links="repo_issues /Tokiya/ThreadDeom/issues">Issues <span class='counter'>0</span></a></li>



    <li><a href="/Tokiya/ThreadDeom/graphs" class="js-selected-navigation-item " data-selected-links="repo_graphs repo_contributors /Tokiya/ThreadDeom/graphs">Graphs</a></li>


  </ul>
  
<div class="tabnav">

  <span class="tabnav-right">
    <ul class="tabnav-tabs">
          <li><a href="/Tokiya/ThreadDeom/tags" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_tags /Tokiya/ThreadDeom/tags">Tags <span class="counter blank">0</span></a></li>
    </ul>
  </span>

  <div class="tabnav-widget scope">


    <div class="select-menu js-menu-container js-select-menu js-branch-menu">
      <a class="minibutton select-menu-button js-menu-target" data-hotkey="w" data-ref="master">
        <span class="mini-icon mini-icon-branch"></span>
        <i>branch:</i>
        <span class="js-select-button">master</span>
      </a>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container">

        <div class="select-menu-modal">
          <div class="select-menu-header">
            <span class="select-menu-title">Switch branches/tags</span>
            <span class="mini-icon mini-icon-remove-close js-menu-close"></span>
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
                  <span class="select-menu-item-icon mini-icon mini-icon-confirm"></span>
                  <a href="/Tokiya/ThreadDeom/blob/master/src/Singleton.java" class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target" data-name="master" rel="nofollow" title="master">master</a>
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
    <li><a href="/Tokiya/ThreadDeom" class="selected js-selected-navigation-item tabnav-tab" data-selected-links="repo_source /Tokiya/ThreadDeom">Files</a></li>
    <li><a href="/Tokiya/ThreadDeom/commits/master" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_commits /Tokiya/ThreadDeom/commits/master">Commits</a></li>
    <li><a href="/Tokiya/ThreadDeom/branches" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_branches /Tokiya/ThreadDeom/branches" rel="nofollow">Branches <span class="counter ">1</span></a></li>
  </ul>

</div>

  
  
  


            
          </div>
        </div><!-- /.repohead -->

        <div id="js-repo-pjax-container" class="container context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:d4b06d4c9a83e42440c8dc3192fbd016 -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:d4b06d4c9a83e42440c8dc3192fbd016 -->


<div id="slider">
    <div class="frame-meta">

      <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

        <div class="breadcrumb">
          <span class='bold'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/Tokiya/ThreadDeom" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">ThreadDeom</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/Tokiya/ThreadDeom/tree/master/src" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><strong class="final-path">Singleton.java</strong> <span class="js-zeroclipboard zeroclipboard-button" data-clipboard-text="src/Singleton.java" data-copied-hint="copied!" title="copy to clipboard"><span class="mini-icon mini-icon-clipboard"></span></span>
        </div>

      <a href="/Tokiya/ThreadDeom/find/master" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>


        <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/Tokiya/ThreadDeom/contributors/master/src/Singleton.java">
          Fetching contributors…

          <div class="participation">
            <p class="loader-loading"><img alt="Octocat-spinner-32-eaf2f5" height="16" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif?1334862346" width="16" /></p>
            <p class="loader-error">Cannot retrieve contributors at this time</p>
          </div>
        </div>

    </div><!-- ./.frame-meta -->

    <div class="frames">
      <div class="frame" data-permalink-url="/Tokiya/ThreadDeom/blob/a3a7770e9d6e85c90b0a78ba398ae8b8ffe52e51/src/Singleton.java" data-title="ThreadDeom/src/Singleton.java at master · Tokiya/ThreadDeom · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="mini-icon mini-icon-text-file"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>21 lines (16 sloc)</span>
                <span>0.304 kb</span>
              </div>
              <div class="actions">
                <div class="button-group">
                      <a class="minibutton js-entice" href=""
                         data-entice="You must be signed in and on a branch to make or propose changes">Edit</a>
                  <a href="/Tokiya/ThreadDeom/raw/master/src/Singleton.java" class="button minibutton " id="raw-url">Raw</a>
                    <a href="/Tokiya/ThreadDeom/blame/master/src/Singleton.java" class="button minibutton ">Blame</a>
                  <a href="/Tokiya/ThreadDeom/commits/master/src/Singleton.java" class="button minibutton " rel="nofollow">History</a>
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

          </td>
          <td class="blob-line-code">
                  <div class="highlight"><pre><div class='line' id='LC1'><br/></div><div class='line' id='LC2'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Singleton</span> <span class="o">{</span></div><div class='line' id='LC3'><br/></div><div class='line' id='LC4'>	<span class="kd">private</span> <span class="nf">Singleton</span><span class="o">(){}</span></div><div class='line' id='LC5'><br/></div><div class='line' id='LC6'>	<span class="kd">private</span> <span class="kd">static</span> <span class="n">Singleton</span> <span class="n">singl</span><span class="o">;</span></div><div class='line' id='LC7'>	<span class="kd">private</span> <span class="kd">static</span> <span class="n">Object</span> <span class="n">token</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Object</span><span class="o">();</span></div><div class='line' id='LC8'><br/></div><div class='line' id='LC9'>	<span class="kd">public</span> <span class="kd">static</span> <span class="n">Singleton</span> <span class="nf">getInstance</span><span class="o">()</span></div><div class='line' id='LC10'>	<span class="o">{</span></div><div class='line' id='LC11'>		<span class="k">if</span><span class="o">(</span><span class="n">singl</span> <span class="o">==</span> <span class="kc">null</span><span class="o">){</span></div><div class='line' id='LC12'>			<span class="kd">synchronized</span><span class="o">(</span><span class="n">token</span><span class="o">)</span></div><div class='line' id='LC13'>			<span class="o">{</span></div><div class='line' id='LC14'>				<span class="k">if</span><span class="o">(</span><span class="n">singl</span><span class="o">==</span><span class="kc">null</span><span class="o">)</span></div><div class='line' id='LC15'>					<span class="n">singl</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Singleton</span><span class="o">();</span></div><div class='line' id='LC16'>			<span class="o">}</span></div><div class='line' id='LC17'>		<span class="o">}</span></div><div class='line' id='LC18'>		<span class="k">return</span> <span class="n">singl</span><span class="o">;</span></div><div class='line' id='LC19'>	<span class="o">}</span></div><div class='line' id='LC20'><span class="o">}</span></div></pre></div>
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
  <img class="js-frame-loading-spinner" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-128.gif?1347543529" height="64" width="64">
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
        <dd><a href="https://github.com/about">About us</a></dd>
        <dd><a href="https://github.com/blog">Blog</a></dd>
        <dd><a href="https://github.com/contact">Contact &amp; support</a></dd>
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
        <dd><a href="https://github.com/edu">Students &amp; teachers</a></dd>
        <dd><a href="http://shop.github.com">The Shop</a></dd>
        <dd><a href="/plans">Plans &amp; pricing</a></dd>
        <dd><a href="http://octodex.github.com/">The Octodex</a></dd>
      </dl>

      <hr class="footer-divider">


    <p class="right">&copy; 2013 <span title="0.06963s from fe13.rs.github.com">GitHub</span>, Inc. All rights reserved.</p>
    <a class="left" href="https://github.com/">
      <span class="mega-icon mega-icon-invertocat"></span>
    </a>
    <ul id="legal">
        <li><a href="https://github.com/site/terms">Terms of Service</a></li>
        <li><a href="https://github.com/site/privacy">Privacy</a></li>
        <li><a href="https://github.com/security">Security</a></li>
    </ul>

  </div><!-- /.container -->

</div><!-- /.#footer -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
          <div class="suggester-container">
              <div class="suggester fullscreen-suggester js-navigation-container" id="fullscreen_suggester"
                 data-url="/Tokiya/ThreadDeom/suggestions/commit">
              </div>
          </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped leftwards" title="Exit Zen Mode">
      <span class="mega-icon mega-icon-normalscreen"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped leftwards"
      title="Switch themes">
      <span class="mini-icon mini-icon-brightness"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="mini-icon mini-icon-exclamation"></span>
      Something went wrong with that request. Please try again.
      <a href="#" class="mini-icon mini-icon-remove-close ajax-error-dismiss"></a>
    </div>

    
    
    <span id='server_response_time' data-time='0.07003' data-host='fe13'></span>
    
  </body>
</html>

