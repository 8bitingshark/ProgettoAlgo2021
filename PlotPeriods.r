naive <- read.table(sep="|", file="new naive test.csv")
smart <- read.table(sep="|", file="new smart test.csv")
t_naive <- t(naive)
t_smart <- t(smart)
names <- t_naive[1, ]
colnames(t_naive) <- names
colnames(t_smart) <- names
t_naive <- head(t_naive[-1, ], -1)
t_smart <- head(t_smart[-1, ], -1)

png(filename="naive_plot.png")
boxplot(t_naive, ylim = c(0, 1.2e+07))
dev.off()

png(filename="smart_plot.png")
boxplot(t_smart, ylim = c(0, 1.2e+07))
dev.off()