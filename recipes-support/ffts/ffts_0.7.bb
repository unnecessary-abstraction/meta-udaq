SUMMARY = "FFTS: Fastest Fourier Transform in the South (float)"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=9a5de424504d2430b8af511a981d201e"

SRC_URI = "http://anthonix.com/ffts/releases/${BPN}-${PV}.tar.gz \
"
SRC_URI[md5sum] = "6d6f4479dfffc5ccc6deb5a911414abe"
SRC_URI[sha256sum] = "6362e498e5aa241661cfe9060153076b78e300a5d3c365997ba6ac2f637df3ff"

inherit autotools

EXTRA_OECONF = "--enable-single --enable-neon"
#CFLAGS_append = " -D__ARM_PCS_VFP -D_POSIX_C_SOURCE=200809L -D_XOPEN_SOURCE=700"
