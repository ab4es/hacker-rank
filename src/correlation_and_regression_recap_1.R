### Compute Karl Pearson's cofficient correlation to three decimal places
### rho(a, b) = cov(a, b) / (sd(a)*sd(b))

# Read input
data <- read.table("./data/correlation_and_regression_recap_1.txt", header = FALSE, sep = ",", row.names = c("class1", "class2"))
data <- data[, 2:ncol(data)] # drop class names

cor(data, method = c("pearson"))
