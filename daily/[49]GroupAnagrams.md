<p>给你一个字符串数组，请你将 <span data-keyword="anagram">字母异位词</span> 组合在一起。可以按任意顺序返回结果列表。</p>

<p>&nbsp;</p>

<p><strong>示例 1:</strong></p>

<div class="example-block"> 
 <p><strong>输入:</strong> strs = ["eat", "tea", "tan", "ate", "nat", "bat"]</p> 
</div>

<p><strong>输出: </strong>[["bat"],["nat","tan"],["ate","eat","tea"]]</p>

<p><strong>解释：</strong></p>

<ul> 
 <li>在 strs 中没有字符串可以通过重新排列来形成 <code>"bat"</code>。</li> 
 <li>字符串 <code>"nat"</code> 和 <code>"tan"</code> 是字母异位词，因为它们可以重新排列以形成彼此。</li> 
 <li>字符串 <code>"ate"</code>&nbsp;，<code>"eat"</code>&nbsp;和 <code>"tea"</code> 是字母异位词，因为它们可以重新排列以形成彼此。</li> 
</ul>

<p><strong>示例 2:</strong></p>

<div class="example-block"> 
 <p><strong>输入:</strong> strs = [""]</p> 
</div>

<p><strong>输出: </strong>[[""]]</p>

<p><strong>示例 3:</strong></p>

<div class="example-block"> 
 <p><strong>输入:</strong> strs = ["a"]</p> 
</div>

<p><strong>输出: </strong>[["a"]]</p>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= strs.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>0 &lt;= strs[i].length &lt;= 100</code></li> 
 <li><code>strs[i]</code>&nbsp;仅包含小写字母</li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>字符串</li><li>排序</li></div></div><br><div><li>👍 2333</li><li>👎 0</li></div>