package com.cabolabs.openehr.opt.model

class Term {

   String text
   String description
   
   String toString()
   {
      return this.text +' ('+ this.description + ')'
   }
}
