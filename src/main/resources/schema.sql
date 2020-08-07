-- Drop table

-- DROP TABLE daily_adjusted;

CREATE TABLE if not exists daily_adjusted (
	"date" date NOT NULL,
	symbol varchar(10) NOT NULL,
	"open" numeric(8,4) NOT NULL,
	high numeric(8,4) NOT NULL,
	low numeric(8,4) NOT NULL,
	"close" numeric(8,4) NOT NULL,
	adjusted_close numeric(10,5) NULL,
	volume numeric NOT NULL,
	dividend_amount numeric(8,4) NULL,
	split_coefficient numeric(8,4) NULL
);

-- Drop table

-- DROP TABLE monthly_adjusted;

CREATE TABLE if not exists monthly_adjusted (
	"date" date NOT NULL,
	symbol varchar(10) NOT NULL,
	"open" numeric(8,4) NOT NULL,
	high numeric(8,4) NOT NULL,
	low numeric(8,4) NOT NULL,
	"close" numeric(8,4) NOT NULL,
	adjusted_close numeric(10,5) NULL,
	volume numeric NOT NULL,
	dividend_amount numeric(8,4) NULL,
	split_coefficient numeric(8,4) NULL
);

-- Drop table

-- DROP TABLE weekly_adjusted;

CREATE TABLE if not exists weekly_adjusted (
	"date" date NOT NULL,
	symbol varchar(10) NOT NULL,
	"open" numeric(8,4) NOT NULL,
	high numeric(8,4) NOT NULL,
	low numeric(8,4) NOT NULL,
	"close" numeric(8,4) NOT NULL,
	adjusted_close numeric(10,5) NULL,
	volume numeric NOT NULL,
	dividend_amount numeric(8,4) NULL,
	split_coefficient numeric(8,4) NULL
);
