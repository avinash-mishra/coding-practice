countValleys <- function(n, s){
  lvl = 0
  v = 0

  charString = strsplit(s, "")[[1]]

  for (c in charString){
      if (c == 'U'){
          lvl <- lvl+1
        }
      if (c == 'D'){
          lvl <- lvl-1
        }
      if (lvl == 0 && c == 'U'){
          v <- v + 1
        }
  }
  return(v)
}

main<- function(){
  cat("enter n : ")
  n <- as.integer(readLines("stdin", n=1))
  cat("enter s : ")
  s <- readLines("stdin", n=1)
  result <- countValleys(n, s)
  print(result)
}

main()
